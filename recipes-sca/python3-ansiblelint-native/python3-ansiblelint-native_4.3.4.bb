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
SRC_URI = "https://files.pythonhosted.org/packages/58/59/fd110e80511d388718a0131129b643fb53a6a41abc5b288beb289006fecc/ansible_lint-4.3.4-py2.py3-none-any.whl;downloadfilename=ansible_lint-${PV}-py2.py3-none-any.zip;subdir=${BP} \
           file://ansiblelint.sca.description"

SRC_URI[md5sum] = "3dce161996161c8743dcb851ff908ad6"
SRC_URI[sha256sum] = "bbe81074615ba80e0eb65ffea1ce3c9adb143574b38f3520371e4df63b4300bd"

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
