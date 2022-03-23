//package com.example.ObjectUtil;
//
//
//import java.io.File;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//
//import javax.xml.bind.JAXBContext;
//
//import org.hibernate.annotations.common.util.impl.LoggerFactory;
//import org.springframework.http.HttpStatus;
//
//import com.capitalbanker.cgb.ws.common.constant.Constants;
//import com.capitalbanker.cgb.ws.common.domain.GenericApplicationIdentityObject;
//import com.capitalbanker.cgb.ws.common.domain.error.dictionary.Errors;
//import com.capitalbanker.cgb.ws.common.domain.error.dictionary.Message;
//import com.capitalbanker.cgb.ws.common.domain.error.dictionary.ObjectFactory;
//import com.capitalbanker.cgb.ws.common.enums.CommonErrors;
//import com.example.demo.Exception.ErrorObject;
//
//import ch.qos.logback.classic.Logger;
//import lombok.Value;
//import springfox.documentation.spring.web.paths.Paths;
//
//public class ErrorUtilities {
//	private static final Logger log = LoggerFactory.getLogger(ErrorUtilities.class);
//
//	 @Value("${error.dictionary.path}")
//	private String errorDictionaryDirectory;
//
//	 @Value("${error.file.name}")
//	private String errorDictionaryFileName;
//
//	public ErrorObject getError(CommonErrors error, String language,
//			GenericApplicationIdentityObject applicationIdentity) {
//		return getError(error.toString(), language, applicationIdentity);
//	}
//
//	public ErrorObject getError(String id, String errorMessage, String language,
//			GenericApplicationIdentityObject applicationIdentity) {
//		ErrorObject error = getError(id, language, applicationIdentity);
//		if (error != null && error.getErrorCode() != null
//				&& error.getErrorCode().equals(Constants.ERROR_CODE_ID_NOT_FOUND))
//			if (id == null || id.isEmpty()) {
//				error.setMessage(errorMessage);
//			} else {
//				error.setMessage(String.format("%s - %s", new Object[] { id, errorMessage }));
//			}
//		return error;
//	}
//
//	public ErrorObject getError(String id, String language, GenericApplicationIdentityObject applicationIdentity) {
//		List<Error> applicationErrors = getApplicationErrors(applicationIdentity);
//		List<Error> commonErrors = getCommonErrors(applicationIdentity);
//		ErrorObject error = null;
//		if ((applicationErrors != null && !applicationErrors.isEmpty())
//				|| (commonErrors != null && !commonErrors.isEmpty())) {
//			Optional<Error> errorFromList = Optional.empty();
//			if (applicationErrors != null && !applicationErrors.isEmpty())
//				errorFromList = applicationErrors.stream().filter(i -> i.getId().equalsIgnoreCase(paramString))
//						.findFirst();
//			if (!errorFromList.isPresent() && commonErrors != null && !commonErrors.isEmpty())
//				errorFromList = commonErrors.stream().filter(i -> i.getId().equalsIgnoreCase(paramString)).findFirst();
//			if (errorFromList.isPresent()) {
//				error = new ErrorObject();
//				error.setErrorId(id);
//				error.setErrorCode(((Error) errorFromList.get()).getCode());
//				error.setHttpStatus(((Error) errorFromList.get()).getHttpStatus());
//				Optional<Message> errorMessageUserLanguage = ((Error) errorFromList.get()).getMessage().stream()
//						.filter(i -> i.getLanguage().equalsIgnoreCase(paramString)).findFirst();
//				if (errorMessageUserLanguage.isPresent()) {
//					error.setMessage(((Message) errorMessageUserLanguage.get()).getContent());
//				} else {
//					log.error("Could not find error message for id = {} and lanugage = {}", id, language);
//					Optional<Message> defaultLanguageErrorMessage = ((Error) errorFromList.get()).getMessage().stream()
//							.filter(i -> i.getLanguage().equalsIgnoreCase("EN")).findFirst();
//					if (defaultLanguageErrorMessage.isPresent()) {
//						error.setMessage(((Message) defaultLanguageErrorMessage.get()).getContent());
//					} else {
//						log.error("Could not find error message for id = {} and default lanugage = {}", id, "EN");
//					}
//				}
//			}
//		}
//		if (error == null) {
//			error = new ErrorObject();
//			error.setErrorId(id);
//			String errorMessage = String.format("Error with id = %s not found in error file",
//					new Object[] { error.getErrorId() });
//			error.setMessage(errorMessage);
//			error.setErrorCode(Constants.ERROR_CODE_ID_NOT_FOUND);
//			log.error(errorMessage);
//		}
//		return error;
//	}
//
//	public ErrorObject formatError(ErrorObject error, Object... arguments) {
//		if (error != null) {
//			String errorMessage = error.getMessage();
//			if (errorMessage != null && !errorMessage.isEmpty()) {
//				errorMessage = errorMessage.replaceAll("\\{VALUE\\}", "%s");
//				errorMessage = String.format(errorMessage, arguments);
//				error.setMessage(errorMessage);
//			}
//		}
//		return error;
//	}
//
//	public HttpStatus tryGetHttpStatus(List<ErrorObject> errors) {
//		ErrorObject error = null;
//		if (errors != null && !errors.isEmpty())
//			error = errors.stream().max(
//					Comparator.comparing(ErrorObject::getHttpStatus, Comparator.nullsLast(Comparator.naturalOrder())))
//					.get();
//		return tryGetHttpStatus(error);
//	}
//
//	public HttpStatus tryGetHttpStatus(ErrorObject error) {
//		HttpStatus httpStatus = Constants.DEFAULT_ERROR_HTTP_STATUS;
//		if (error != null && error.getHttpStatus() != null)
//			try {
//				httpStatus = HttpStatus.valueOf(error.getHttpStatus().intValue());
//			} catch (Exception e) {
//				log.error("Error id {} http Status {} is not a valid http status. Returing default http status {}",
//						new Object[] { error.getErrorId(), error.getHttpStatus(), httpStatus });
//			}
//		return httpStatus;
//	}
//
//	private List<Error> getApplicationErrors(GenericApplicationIdentityObject applicationIdentity) {
//		List<Error> errors = getApplicationErrorsFromCache(applicationIdentity);
//		if (errors == null) {
//			String applicationDictionaryFile = Paths
//					.get(this.errorDictionaryDirectory,
//							new String[] { String.format("%s_%s", new Object[] {
//									applicationIdentity.getName().toLowerCase(), this.errorDictionaryFileName }) })
//					.toAbsolutePath().toString();
//			errors = getErrorsFromFile(applicationDictionaryFile);
//		}
//		return errors;
//	}
//
//	private List<Error> getCommonErrors(GenericApplicationIdentityObject applicationIdentity) {
//		List<Error> errors = getCommonErrorsFromCache(applicationIdentity);
//		if (errors == null) {
//			String commonDictionaryFile = Paths
//					.get(this.errorDictionaryDirectory,
//							new String[] { String.format("%s", new Object[] { this.errorDictionaryFileName }) })
//					.toAbsolutePath().toString();
//			errors = getErrorsFromFile(commonDictionaryFile);
//		}
//		return errors;
//	}
//
//	private List<Error> getApplicationErrorsFromCache(GenericApplicationIdentityObject applicationIdentity) {
//		return null;
//	}
//
//	private List<Error> getCommonErrorsFromCache(GenericApplicationIdentityObject applicationIdentity) {
//		return null;
//	}
//
//	private List<Error> getErrorsFromFile(String errorFilePath) {
//		    List<Error> listOfErrors = null;
//		    File errorFile = new File(errorFilePath);
//		    if (errorFile.exists()) {
//		      Errors errors = null;
//		      try {
//		        JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] { ObjectFactory.class });
//		        errors = (Errors)jaxbContext.createUnmarshaller().unmarshal(errorFile);
//		      } catch (Exception e) {
//		        log.error("An error occured while parsing error dictionary file from path {}: {}", 
//		            errorFile.getAbsolutePath(), e);
//		        throw new RuntimeException(e);
//		      } 
//		      if (errors != null)
//		        listOfErrors = errors.getError(); 
//		    } else {
//		      log.warn("Error file {} not found", errorFile.getAbsolutePath());
//		    } 
//		    return listOfErrors;
//		  }