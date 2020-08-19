SUMMARY = "Checks playbooks for practices and behaviour that could potentially be improved"
HOMEPAGE = "https://github.com/ansible/ansible-lint"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ansible_lint-${PV}.dist-info/LICENSE;md5=27006a41205763794866943ed14d2493"

DEPENDS += "\
            ${PYTHON_PN}-ansible-native \
            ${PYTHON_PN}-bcrypt-native \
            ${PYTHON_PN}-cryptography-native \
            ${PYTHON_PN}-paramiko-native \
            ${PYTHON_PN}-pathlib2-native \
            ${PYTHON_PN}-pyasn1-native \
            ${PYTHON_PN}-pynacl-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-ruamelyaml-native \
            ${PYTHON_PN}-scandir-native \
            ${PYTHON_PN}-setuptools-scm-git-archive-native \
            ${PYTHON_PN}-setuptools-scm-native \
            ${PYTHON_PN}-six-native \
            "

# wheel-files are just zip-files, so we can threat them like that
SRC_URI = "https://files.pythonhosted.org/packages/8c/16/a3aa1549785fd3f820a620ecbdc018105f4791b5f83bd08c03fe6e88f0e6/ansible_lint-4.3.0-py2.py3-none-any.whl;downloadfilename=ansible_lint-${PV}-py2.py3-none-any.zip;subdir=${BP} \
           file://ansiblelint.sca.description"

SRC_URI[md5sum] = "bbd0b6efd3b0a53a53826329f8a382d9"
SRC_URI[sha256sum] = "eebfceb961e3c1c0c7a1ae41147f0858cfb744771421fc8f404d4f6cfb5a5d3a"

UPSTREAM_CHECK_URI ?= "https://pypi.python.org/pypi/ansible_lint/"
UPSTREAM_CHECK_REGEX = "ansible_lint-(?P<pver>\d+\.\d+\.\d+)-py2\.py3-none-any\.whl"

do_unpack[depends] += "unzip-native:do_populate_sysroot"

inherit python3native
inherit sca-description
inherit native

do_install() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/ansiblelint
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/ansible_lint-${PV}.dist-info

    cp -r ${S}/ansiblelint/* ${D}${libdir}/${PYTHON_DIR}/site-packages/ansiblelint/
    install -m 644 ${S}/ansible_lint-${PV}.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/ansible_lint-${PV}.dist-info/

    install -d ${D}${datadir}
    install ${WORKDIR}/ansiblelint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir} ${PYTHON_SITEPACKAGES_DIR}"
