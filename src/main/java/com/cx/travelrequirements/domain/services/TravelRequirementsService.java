package com.cx.travelrequirements.domain.services;

import com.cx.travelrequirements.domain.models.TravelRequirements;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
@NoArgsConstructor
public class TravelRequirementsService {
    private final Map<String, TravelRequirements> travelRequirementsMap = new HashMap<>();

    @PostConstruct
    void init() {
        travelRequirementsMap.put(
                "China", new TravelRequirements("China", List.of("Entry by foreign nationals holding a visa is suspended.",
                        "Entry by foreign nationals with a residence permit is suspended.",
                        "Entry by foreign nationals with an APEC Business Travel Card is suspended.",
                        "Port visas, 24/72/144-hour visa-free transit policy, Hainan 30-day visa-free policy, " +
                                "15-day visa-free policy specified for foreign cruise-group-tour through Shanghai Port, " +
                                "Guangdong 144-hour visa-free policy specified for foreign tour groups from Hong Kong " +
                                "or Macao SAR, and Guangxi 15-day visa-free policy specified for foreign tour groups " +
                                "of ASEAN countries are suspended.",
                        "Passengers are subject to medical screening and quarantine for 14 days at the first point of entry.",
                        "Passengers entering Beijing (PEK) from Hong Kong SAR, China must have a medical certificate with " +
                                "a negative Coronavirus (COVID-19) PCR test result issued at most 7 days before departure."))
        );

        travelRequirementsMap.put(
                "Japan", new TravelRequirements("Japan", List.of("Passengers could be subject to quarantine for " +
                                "up to 14 days. Details can be found at https://www.mhlw.go.jp/content/000852722.pdf",
                        "Visa exemption for passengers with a British passport, Chinese Taipei (on the cover: Republic of China Taiwan) passport, " +
                                "Hong Kong (SAR China) passport and Macao (SAR China) passport is suspended.",
                        "Visa exemption for nationals of Andorra, Argentina, Australia, Austria, Bahamas, Barbados, " +
                                "Belgium, Brunei Darussalam, Bulgaria, Costa Rica, Croatia, Czechia, Cyprus, Denmark, " +
                                "Dominican Rep., El Salvador, Estonia, Finland, France, Germany, Greece, Guatemala, " +
                                "Honduras, Hungary, Iceland, Indonesia, Iran, Ireland (Rep.), Israel, Italy, " +
                                "Korea (Rep.), Latvia, Lesotho, Liechtenstein, Lithuania, Luxembourg, Malaysia, Malta, " +
                                "Mexico, Monaco, Netherlands, New Zealand, Norway, Peru, Poland, Portugal, Romania, " +
                                "San Marino, Singapore, Slovakia, Slovenia, Spain, Suriname, Sweden, Switzerland, " +
                                "Thailand, Tunisia, United Arab Emirates, Uruguay and Vatican City (Holy See) " +
                                "is suspended.",
                        "Visas issued on or before 8 March 2020 by a diplomatic representation of Japan in China " +
                                "(People's Rep.), Hong Kong (SAR China), Korea (Rep.) or Macao (SAR China) are invalidated.",
                        "Visas issued on or before 2 April 2020 by a diplomatic representation of Japan in Afghanistan, " +
                                "Algeria, Angola, Antigua and Barbuda, Argentina, Azerbaijan, Bahamas, Bangladesh, " +
                                "Barbados, Belarus, Belize, Benin, Bhutan, Botswana, Burkina Faso, ",
                        "Passengers transiting through Tokyo (NRT) must transit on the same calendar day.",
                        "Passengers must install the \"MySOS\" mobile app."
                ))
        );

        travelRequirementsMap.put(
                "Korea", new TravelRequirements("Korea", List.of("Short-term visas (type C-1 and C-3) issued on or before 5 April 2020 are no longer valid.",
                        "Suspension of visa exemptions for nationals of Japan.",
                        "Suspension of visa exemptions for passengers with a Chinese Taipei (on the cover: Republic of China Taiwan) normal passport.",
                        "Suspension of visa exemptions for passengers with a Hong Kong (SAR China) passport.",
                        "Suspension of visa exemptions for passengers with a Macao (SAR China) passport.",
                        "Passengers could be subject to quarantine for 10 days.",
                        "Passengers must complete a \"Health Declaration Form\" and a \"Travel Record Declaration\" and" +
                                " present it upon arrival. The forms can be obtained upon arrival."

                ))
        );

        travelRequirementsMap.put(
                "United States", new TravelRequirements("United States", List.of("Passengers entering or" +
                        " transiting through the USA must have a COVID-19 vaccination certificate showing that they " +
                        "were fully vaccinated at least 15 days (day of vaccination + 14 days) before arrival. Passenger" +
                        " details (e.g., name and date of birth) in the certificate must match those stated in the " +
                        "passport/travel document.",
                        "Passengers entering or transiting through the USA must have a negative COVID-19 test taken at " +
                                "most 3 days before departure from the first embarkation point. Tests accepted are: " +
                                "antigen, NAAT, RT-LAMP, RT-PCR or TMA. Passengers details (e.g., name and date of " +
                                "birth) in the certificate must match those stated in the passport or other travel " +
                                "document; and the test result must specify \"negative\" or \"not detected\". If " +
                                "marked \"invalid\" it is not accepted.",
                        "DV visas issued in September 2020 that expired are accepted for entry.",
                        "Nationals of the U.S.A. are allowed to enter with an expired passport.",
                        "Passengers could be subject to self-isolation or self-quarantine.",
                        "Passengers entering or transiting through the USA, who are not fully vaccinated must have a" +
                                " negative COVID-19 test taken at most 1 day before departure from the first embarkation " +
                                "point. Tests accepted are: antigen, NAAT, RT-LAMP, RT-PCR or TMA. Passenger details " +
                                "(e.g., name and date of birth) in the certificate must match those stated in the " +
                                "passport/travel document; and the test result must specify \"negative\" or \"not " +
                                "detected\". If marked \"invalid\" it is not accepted."))
        );

        travelRequirementsMap.put(
                "United Kingdom", new TravelRequirements("United Kingdom", List.of("Passengers entering or " +
                                "transiting through the United Kingdom must have a negative COVID-19 test result. " +
                                "The test must have been taken at most 3 days before departure of the last direct flight" +
                                " to the United Kingdom. Tests accepted are: antigen, LAMP, nucleic acid and PCR tests. " +
                                "The test result must be in English, French or Spanish. Passengers details (name, date" +
                                " of birth or age) on the test result must match those stated in the passport or other" +
                                " travel document. The test result must also include the contact details of the issuing" +
                                " laboratory.",
                        "Passengers entering the United Kingdom must complete a \"Public Health Passenger Locator Form\". " +
                                "The form must include the booking reference number for the required COVID-19 tests or" +
                                " the invoice number for the quarantine hotel booking. The form can be obtained " +
                                "at https://www.gov.uk/provide-journey-contact-details-before-travel-uk and must be" +
                                " presented at check-in and to immigration upon arrival.",
                        "Passengers transiting through the United Kingdom must complete a \"Public Health Passenger " +
                                "Locator Form\". The form can be obtained at https://www.gov.uk/provide-journey-contact-details-before-travel-uk " +
                                "and must be presented at check-in and to immigration upon arrival.",
                        "Passengers are subject to a COVID-19 test on day 2 and day 8 after arrival at their own " +
                                "expense. They must have a payment confirmation obtained at:" +
                                " https://quarantinehotelbookings.ctmportal.co.uk/ or https://www.gov.uk/guidance/providers-of-day-2-and-day-8-coronavirus-testing-for-international-arrivals .",
                        "There are no transit facilities at Manchester (MAN). Passengers must comply with all entry" +
                                " regulations for United Kingdom.",
                        "Airline crew not residing in the United Kingdom are subject to self-isolation in a hotel until" +
                                " their next flight.",
                        "Passengers with an Overseas Domestic Worker visa issued by the UK must be accompanied by the " +
                                "sponsor or one of the first-degree family members of the sponsor."))
        );
    }

    public Set<String> getCountries() {
        return travelRequirementsMap.keySet();
    }

    public Optional<TravelRequirements> getTravelRequirementsByCountry(String country) {
        return Optional.ofNullable(travelRequirementsMap.get(country));
    }
}
