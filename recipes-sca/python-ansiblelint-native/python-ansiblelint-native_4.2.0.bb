SUMMARY = "Checks playbooks for practices and behaviour that could potentially be improved"
HOMEPAGE = "https://github.com/ansible/ansible-lint"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ansible_lint-${PV}.dist-info/LICENSE;md5=27006a41205763794866943ed14d2493"

# wheel-files are just zip-files, so we can threat them like that
SRC_URI = "https://files.pythonhosted.org/packages/13/26/3dbb5aee479c3e60b97ebbadeeec2eb0fa610985e3c94c3c472b02991dbf/ansible_lint-${PV}-py2.py3-none-any.whl;downloadfilename=ansible_lint-${PV}-py2.py3-none-any.zip;subdir=${BP}"

SRC_URI[md5sum] = "fb1931a3222d1d534cb10cbd97b54f5f"
SRC_URI[sha256sum] = "b9fc9a6564f5d60a4284497f966f38ef78f0e2505edbe2bd1225f1ade31c2d8a"

DEPENDS += "\
            python-ansible-native \
            python-bcrypt-native \
            python-cryptography-native \
            python-enum34-native \
            python-ipaddress-native \
            python-native \
            python-paramiko-native \
            python-pathlib2-native \
            python-pyasn1-native \
            python-pynacl-native \
            python-pyyaml-native \
            python-ruamelyaml-native \
            python-scandir-native \
            python-setuptools-scm-git-archive-native \
            python-setuptools-scm-native \
            python-six-native \
            "

do_unpack[depends] += "unzip-native:do_populate_sysroot"  

inherit pythonnative
inherit sca-sanity

FILES_${PN} += "${datadir} ${PYTHON_SITEPACKAGES_DIR}"
SRC_URI += "file://ansiblelint.sca.description \
            file://ansiblelint.sca.score"

inherit native

do_install() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/ansiblelint
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/ansible_lint-${PV}.dist-info

    cp -r ${S}/ansiblelint/* ${D}${libdir}/${PYTHON_DIR}/site-packages/ansiblelint/          
    install -m 644 ${S}/ansible_lint-${PV}.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/ansible_lint-${PV}.dist-info/

    install -d ${D}${datadir}
    install ${WORKDIR}/ansiblelint.sca.description ${D}${datadir}
    install ${WORKDIR}/ansiblelint.sca.score ${D}${datadir}
}
