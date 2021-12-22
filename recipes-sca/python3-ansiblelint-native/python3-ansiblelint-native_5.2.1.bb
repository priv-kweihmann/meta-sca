SUMMARY = "Checks playbooks for practices and behaviour that could potentially be improved"
HOMEPAGE = "https://github.com/ansible/ansible-lint"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27006a41205763794866943ed14d2493"

DEPENDS += "\
            python3-ansible-native \
            python3-bcrypt-native \
            python3-cryptography-native \
            python3-enrich-native \
            python3-packaging-native \
            python3-paramiko-native \
            python3-pathlib2-native \
            python3-pyasn1-native \
            python3-pynacl-native \
            python3-pyyaml-native \
            python3-rich-native \
            python3-ruamelyaml-native \
            python3-ruamelyamlcli-native \
            python3-scandir-native \
            python3-setuptools-scm-git-archive-native \
            python3-setuptools-scm-native \
            python3-six-native \
            python3-tenacity-native \
            python3-toml-native \
            python3-wcmatch-native \
            "

# wheel-files are just zip-files, so we can threat them like that
SRC_URI:append = " file://ansiblelint.sca.description"
SRC_URI[sha256sum] = "d64aca59c8d896541d379b9205b2126b851088aab0a2c2cab19ff74b184cdf1c"

PYPI_PACKAGE = "ansible-lint"

inherit pypi
inherit sca-description
inherit sca-setuptools-legacy
inherit setuptools3
inherit native

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/ansiblelint.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
