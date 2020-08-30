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
            ${PYTHON_PN}-rich-native \
            "

# wheel-files are just zip-files, so we can threat them like that
SRC_URI = "https://files.pythonhosted.org/packages/2c/19/1f5bfdd9c484cc80a0e954aed4bedfbc593e3390b95183daa5028e74b113/ansible_lint-4.3.3-py2.py3-none-any.whl;downloadfilename=ansible_lint-${PV}-py2.py3-none-any.zip;subdir=${BP} \
           file://ansiblelint.sca.description"

SRC_URI[md5sum] = "e57a520f6dbcecdf78c6e765b253dc53"
SRC_URI[sha256sum] = "e1b2a0e1ce75ec97a7d5ae325951e5980047644e6cdaa68b3ed0875f118f661b"

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
