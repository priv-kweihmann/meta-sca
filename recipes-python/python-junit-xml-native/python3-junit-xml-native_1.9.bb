SUMMARY = "Creates JUnit XML test result documents that can be read by tools such as Jenkins"
HOMEPAGE = "https://github.com/kyrus/python-junit-xml"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://junit_xml-${PV}.dist-info/LICENSE.txt;md5=0ec4326265b988497f17c3bf20d2898c"

SRC_URI = "https://files.pythonhosted.org/packages/2a/93/2d896b5fd3d79b4cadd8882c06650e66d003f465c9d12c488d92853dff78/junit_xml-1.9-py2.py3-none-any.whl;downloadfilename=junit_xml-${PV}-py2.py3-none-any.zip;subdir=${BP}"

SRC_URI[md5sum] = "dcb66da4f3905756ddb2432b0a7cdbdc"
SRC_URI[sha256sum] = "ec5ca1a55aefdd76d28fcc0b135251d156c7106fa979686a4b48d62b761b4732"

UPSTREAM_CHECK_URI ?= "https://pypi.python.org/pypi/junit_xml/"
UPSTREAM_CHECK_REGEX = "junit_xml-(?P<pver>\d+\.\d+\.\d+)-py2\.py3-none-any\.whl"

do_unpack[depends] += "unzip-native:do_populate_sysroot"

inherit python3native
inherit native

do_install() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/junit_xml
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/junit_xml-${PV}.dist-info

    cp -r ${S}/junit_xml/* ${D}${libdir}/${PYTHON_DIR}/site-packages/junit_xml/
    install -m 644 ${S}/junit_xml-${PV}.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/junit_xml-${PV}.dist-info/
}

FILES_${PN} += "${PYTHON_SITEPACKAGES_DIR}"
