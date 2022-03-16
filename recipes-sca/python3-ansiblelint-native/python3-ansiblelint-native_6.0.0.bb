SUMMARY = "Checks playbooks for practices and behaviour that could potentially be improved"
HOMEPAGE = "https://github.com/ansible/ansible-lint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

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

SRC_URI[sha256sum] = "8b24227dd778373ecc82fb8b15d796229665990a407112b3ec1086be24c1bead"

PYPI_PACKAGE = "ansible-lint"

inherit pypi
inherit sca-description
inherit sca-setuptools-legacy
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "ansiblelint"
