SUMMARY = "Checks playbooks for practices and behaviour that could potentially be improved"
HOMEPAGE = "https://github.com/ansible/ansible-lint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI[sha256sum] = "2160a60b4ab034c04006d701a1779340ffb0f6e28f030ff8de958e1062a88962"

PYPI_PACKAGE = "ansible-lint"

inherit pypi
inherit sca-description
inherit setuptools_build_meta
inherit native

SCA_TOOL_DESCRIPTION = "ansiblelint"
