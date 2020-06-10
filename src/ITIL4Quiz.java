
public class ITIL4Quiz {
	private GTerm gt;
	private String q1;
	private String q2;
	private String q3;
	private String q4;
	private String q5;
	private String q6;
	private String q7;
	private String q8;
	private String q9;
	private String q10;
	private String q11;
	private String q12;
	private String q13;
	private String q14;
	private String q15;
	private String q16;
	private String q17;
	private String q18;
	private String q19;
	private String q20;
	private String q21;
	private String q22;
	private String q23;
	private String q24;
	private String q25;
	private String q26;
	private String q27;
	private String q28;
	private String q29;
	private String q30;
	private String q31;
	private String q32;
	private String q33;
	private String q34;
	private String q35;
	private String q36;
	private String q37;
	private String q38;
	private String q39;
	private String q40;

	public ITIL4Quiz() {
		this.gt = new GTerm(1200, 400);
		this.gt.setFontSize(20);

		// Question sheet
		this.q1 = "1) Which practice is responsible for moving components to live environments?\n"
				+ "A. Change enablement\r\n" + "B. Release management\r\n" + "C. IT asset management\r\n"
				+ "D. Deployment management";

		this.q2 = "2) Which practice includes the classification and ownership of queries and requests from users?\n"
				+ "A. Service desk\r\n" + "B. Incident management\r\n" + "C. Change enablement\r\n"
				+ "D. Service level management";

		this.q3 = "3) Which practice identifies metrics that reflect the customer’s experience of a service?\n"
				+ "A. Continual improvement\r\n" + "B. Service desk\r\n" + "C. Service level management\r\n"
				+ "D. Problem management";

		this.q4 = "4) What is the PRIMARY use of a change schedule?\n"
				+ "A. To support 'incident management' and improvement planning\r\n"
				+ "B. To manage emergency changes\r\n" + "C. To plan changes and help avoid conflicts\r\n"
				+ "D. To manage standard changes";

		this.q5 = "5) Which service management dimension is focused on activities and how these are coordinated?\n"
				+ "A. Organizations and people\r\n" + "B. Information and technology\r\n"
				+ "C. Partners and suppliers\r\n" + "D. Value streams and processes";

		this.q6 = "6) How does categorization of incidents assist the ‘incident management’ practice?\n"
				+ "A. It helps direct the incident to the correct support area\r\n"
				+ "B. It determines the priority assigned to the incident\r\n"
				+ "C. It ensures that incidents are resolved in timescales agreed with the customer\r\n"
				+ "D. It determines how the service provider is perceived";

		this.q7 = "7) Identify the missing word(s) in the following sentence.\n" + "A. the warranty\r\n"
				+ "B. outcomes\r\n" + "C. the utility\r\n" + "D. outputs";

		this.q8 = "8) Which is a recommendation of the ‘continual improvement’ practice?\n"
				+ "A. There should at least be a small team dedicated to leading ‘continual improvement’ efforts\r\n"
				+ "B. All improvements should be managed as multi-phase projects\r\n"
				+ "C. ‘Continual improvement' should be isolated from other practices\r\n"
				+ "D. External suppliers should be excluded from improvement initiatives";

		this.q9 = "9) Which is a potential benefit of using an IT service management tool to support the 'incident\r\n"
				+ "management' practice?\n"
				+ "A. It may ensure that the cause of incidents is identified within agreed times\r\n"
				+ "B. It may provide automated matching of incidents to problems or known errors\r\n"
				+ "C. It may ensure that supplier contracts are aligned with the needs of the service provider\r\n"
				+ "D. It may provide automated resolution and closure of complex incidents";

		this.q10 = "10) Which role submits service requests?\n" + "A. The user, or their authorized representative\r\n"
				+ "B. The customer, or their authorized representative\r\n"
				+ "C. The sponsor, or their authorized representative\r\n"
				+ "D. The supplier, or their authorized representative";

		this.q11 = "11) Which practice provides a single point of contact for users?\n" + "A. Incident management\r\n"
				+ "B. Change enablement\r\n" + "C. Service desk\r\n" + "D. Service request management";

		this.q12 = "12) Which guiding principle recommends that the four dimensions of service management are\r\n"
				+ "considered?\n" + "A. Think and work holistically\r\n" + "B. Progress iteratively with feedback\r\n"
				+ "C. Focus on value\r\n" + "D. Keep it simple and practical";

		this.q13 = "13) Which would be supported by the ‘service request management’ practice?\n"
				+ "A. A request to authorize a change that could have an effect on a service\r\n"
				+ "B. A request from a user for something which is a normal part of service delivery\r\n"
				+ "C. A request to restore service after a service interruption\r\n"
				+ "D. A request to investigate the cause of multiple related incidents";

		this.q14 = "14) Which practice is the responsibility of everyone in the organization?\n"
				+ "A. Service level management\r\n" + "B. Change enablement\r\n" + "C. Problem management\r\n"
				+ "D. Continual improvement";

		this.q15 = "15) Identify the missing word in the following sentence.\r\n"
				+ "The purpose of the ‘information security management’ practice is to [?] the organization’s\r\n"
				+ "information.\n" + "A. store\r\n" + "B. provide\r\n" + "C. audit\r\n" + "D. protect";

		this.q16 = "16) Which guiding principle recommends collecting data before deciding what can be re-used?\n"
				+ "A. Focus on value\r\n" + "B. Start where you are\r\n" + "C. Keep it simple and practical\r\n"
				+ "D. Progress iteratively with feedback";

		this.q17 = "17) Which is NOT usually included as part of incident management?\n"
				+ "A. Scripts for collecting initial information about incidents\r\n"
				+ "B. Formalized procedures for logging incidents\r\n"
				+ "C. Detailed procedures for the diagnosis of incidents\r\n"
				+ "D. The use of specialized knowledge for complicated incidents";

		this.q18 = "18) Which describes the nature of the guiding principles?\n"
				+ "A. Guiding principles can guide an organization in all circumstances\r\n"
				+ "B. Each guiding principle mandates specific actions and decisions\r\n"
				+ "C. An organization will select and adopt only one of the seven guiding principles\r\n"
				+ "D. Guiding principles describe the processes that all organizations must adopt";

		this.q19 = "19) Which statement about a change authority is CORRECT?\n"
				+ "A. A single change authority should be assigned to authorize all types of change and change\r\n"
				+ "models\r\n" + "B. A change authority should be assigned for each type of change and change model\r\n"
				+ "C. Normal changes are pre-authorized and do not need a change authority\r\n"
				+ "D. Emergency changes can be implemented without authorization from a change authority";

		this.q20 = "20) Which practice has the purpose of making new and changed services and features available for\r\n"
				+ "use?\n" + "A. Change enablement\r\n" + "B. Service request management\r\n"
				+ "C. Release management\r\n" + "D. Deployment management";

		this.q21 = "21) Which value chain activity ensures people understand the organization’s vision?\n"
				+ "A. Improve\r\n" + "B. Plan\r\n" + "C. Deliver and support\r\n" + "D. Obtain/build";

		this.q22 = "22) Which statement about the value chain activities is CORRECT?\n"
				+ "A. Every practice belongs to a specific value chain activity\r\n"
				+ "B. A specific combination of value chain activities and practices forms a service relationship\r\n"
				+ "C. Service value chain activities form a single workflow that enables value creation\r\n"
				+ "D. Each value chain activity contributes to the value chain by transforming specific inputs into\r\n"
				+ "outputs";

		this.q23 = "23) What is the purpose of the ‘supplier management’ practice?\n"
				+ "A. To ensure that the organization‘s suppliers and their performance are managed appropriately\r\n"
				+ "to support the seamless provision of quality products and services\r\n"
				+ "B. To align the organization's practices and services with changing business needs through the\r\n"
				+ "ongoing identification and improvement of services\r\n"
				+ "C. To ensure that the organization’s suppliers and their performance are managed appropriately\r\n"
				+ "at strategic and tactical levels through coordinated marketing, selling, and delivery activities\r\n"
				+ "D. To ensure that accurate and reliable information about the configuration of suppliers' services\r\n"
				+ "is available when and where it is needed";

		this.q24 = "24) What are the two types of cost that a service consumer should evaluate?\n"
				+ "A. The price of the service, and the cost of creating the service\r\n"
				+ "B. The costs removed by the service, and the costs imposed by the service\r\n"
				+ "C. The cost of provisioning the service, and the cost of improving the service\r\n"
				+ "D. The cost of software, and the cost of hardware";

		this.q25 = "25) Which is a purpose of the ‘service desk’ practice?\n"
				+ "A. To reduce the likelihood and impact of incidents by identifying actual and potential causes of\r\n"
				+ "incidents\r\n"
				+ "B. To maximize the number of successful IT changes by ensuring risks are properly assessed\r\n"
				+ "C. To capture demand for incident resolution and service requests\r\n"
				+ "D. To set clear business-based targets for service performance";

		this.q26 = "26) How should an organization adopt continual improvement methods?\n"
				+ "A. Use a new method for each improvement the organization handles\r\n"
				+ "B. Select a few key methods for the types of improvement that the organization handles\r\n"
				+ "C. Build the capability to use as many improvement methods as possible\r\n"
				+ "D. Select a single method for all improvements that the organization handles";

		this.q27 = "27) Which ITIL concept describes governance?\n" + "A. The seven guiding principles\r\n"
				+ "B. The four dimensions of service management\r\n" + "C. The service value chain\r\n"
				+ "D. The service value system";

		this.q28 = "28) Which is a recommendation of the ‘service desk’ practice?\n"
				+ "A. Service desks should avoid the use of automation\r\n"
				+ "B. Service desks should be highly technical\r\n"
				+ "C. Service desks should understand the wider organization\r\n"
				+ "D. Service desks should be a physical team in a single fixed location";

		this.q29 = "29) Which guiding principle recommends organizing work into smaller, manageable sections that can\r\n"
				+ "be executed and completed in a timely manner?\n" + "A. Focus on value\r\n"
				+ "B. Start where you are\r\n" + "C. Progress iteratively with feedback\r\n"
				+ "D. Collaborate and promote visibility";

		this.q30 = "30) What is a standard change?\n"
				+ "A. A change that is well understood, fully documented and pre-authorized\r\n"
				+ "B. A change that needs to be assessed, authorized, and scheduled by a change authority\r\n"
				+ "C. A change that doesn’t need a risk assessment because it is required to resolve an incident\r\n"
				+ "D. A change that is assessed, authorized, and scheduled as part of ‘continual improvement’";

		this.q31 = "31) What happens if a workaround becomes the permanent way of dealing with a problem that\r\n"
				+ "cannot be resolved cost-effectively?\n" + "A. A change request is submitted to change enablement\r\n"
				+ "B. Problem management restores the service as soon as possible\r\n"
				+ "C. The problem remains in the known error status\r\n" + "D. The problem record is deleted";

		this.q32 = "32) What is the definition of change?\n"
				+ "A. To add, modify or remove anything that could have a direct or indirect effect on services\r\n"
				+ "B. To ensure that accurate and reliable information about the configuration of services is\r\n"
				+ "available\r\n" + "C. To make new and changed services and features available for use\r\n"
				+ "D. To move new or changed hardware, software, or any other component to live environments";

		this.q33 = "33) What is the definition of an event?\n"
				+ "A. Any change of state that has significance for the management of a service or other\r\n"
				+ "configuration item\r\n"
				+ "B. Any component that needs to be managed in order to deliver an IT service\r\n"
				+ "C. An unplanned interruption to a service or reduction in the quality of a service\r\n"
				+ "D. Any financially valuable component that can contribute to the delivery of an IT product or\r\n"
				+ "service";

		this.q34 = "34) Which describes outcomes?\n" + "A. Tangible or intangible deliverables\r\n"
				+ "B. Functionality offered by a product or service\r\n" + "C. Results desired by a stakeholder\r\n"
				+ "D. Configuration of an organization’s resources";

		this.q35 = "35) Which is NOT a key focus of the ‘information and technology’ dimension?\n"
				+ "A. Security and compliance\r\n" + "B. Communication systems and knowledge bases\r\n"
				+ "C. Workflow management and inventory systems\r\n" + "D. Roles and responsibilities";

		this.q36 = "36) Which practices are typically involved in the implementation of a problem resolution?\n1. Continual improvement\r\n"
				+ "2. Service request management\r\n" + "3. Service level management\r\n" + "4. Change enablement\n"
				+ "A. 1 and 2\r\n" + "B. 2 and 3\r\n" + "C. 3 and 4\r\n" + "D. 1 and 4";

		this.q37 = "37) Which is a key consideration for the guiding principle ‘keep it simple and practical’?\n"
				+ "A. Try to create a solution for every exception\r\n"
				+ "B. Understand how each element contributes to value creation\r\n"
				+ "C. Ignore the conflicting objectives of different stakeholders\r\n"
				+ "D. Start with a complex solution, then simplify";

		this.q38 = "38) What should be done first when applying the ‘focus on value’ guiding principle?\n"
				+ "A. Identify the outcomes that the service facilitates\r\n"
				+ "B. Identify all suppliers and partners involved in the service\r\n"
				+ "C. Determine who the service consumer is in each situation\r\n"
				+ "D. Determine the cost of providing the service";

		this.q39 = "39) A service provider describes a package that includes a laptop with software, licenses, and\r\n"
				+ "support. What is this package an example of?\n" + "A. Value\r\n" + "B. An outcome\r\n"
				+ "C. Warranty\r\n" + "D. A service offering";

		this.q40 = "40) What is the definition of warranty?\n"
				+ "A. A tangible or intangible deliverable that is produced by carrying out an activity\r\n"
				+ "B. The assurance that a product or service will meet agreed requirements\r\n"
				+ "C. A possible event that could cause harm or loss, or make it more difficult to achieve objectives\r\n"
				+ "D. The functionality offered by a product or service to meet a particular need";

		// Answer sheet
		Question[] questions = { new Question(q1, "d"), new Question(q2, "a"), new Question(q3, "c"),
				new Question(q4, "c"), new Question(q5, "d"), new Question(q6, "a"), new Question(q7, "b"),
				new Question(q8, "a"), new Question(q9, "b"), new Question(q10, "a"), new Question(q11, "c"),
				new Question(q12, "a"), new Question(q13, "b"), new Question(q14, "d"), new Question(q15, "d"),
				new Question(q16, "b"), new Question(q17, "c"), new Question(q18, "a"), new Question(q19, "b"),
				new Question(q20, "c"), new Question(q21, "b"), new Question(q22, "d"), new Question(q23, "a"),
				new Question(q24, "b"), new Question(q25, "c"), new Question(q26, "b"), new Question(q27, "d"),
				new Question(q28, "c"), new Question(q29, "c"), new Question(q30, "a"), new Question(q31, "c"),
				new Question(q32, "a"), new Question(q33, "a"), new Question(q34, "c"), new Question(q35, "d"),
				new Question(q36, "d"), new Question(q37, "b"), new Question(q38, "c"), new Question(q39, "d"),
				new Question(q40, "b") };

		this.takeTest(questions);

	}

	public static void main(String[] args) {
		ITIL4Quiz itil = new ITIL4Quiz();

	}

	public void takeTest(Question[] questions) {

		int score = 0;

		int i = 0;
		while (i < questions.length) {
			this.gt.println(questions[i].prompt);
			String answerFromUser = this.gt.getInputString("Enter you answer: \ni.e. A, B, C or D");
			if (answerFromUser.equals(questions[i].answer)) {
				score++;
			}
				i++;
			this.gt.clear();
		}
		this.gt.setFontSize(40);
		this.gt.println("Quiz Complete! You got " + score + "/" + questions.length);
	}
}
