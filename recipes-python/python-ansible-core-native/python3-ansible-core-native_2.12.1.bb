SUMMARY = "Ansible is the simplest way to automate apps and IT infrastructure"
DESCRIPTION = "Ansible is a simple IT automation platform that makes your applications and systems easier to deploy"
HOMEPAGE = "https://github.com/ansible/ansible/"
SECTION = "devel/python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS += "\
    python3-cryptography-native \
    python3-jinja2-native \
    python3-packaging-native \
    python3-pyyaml-native \
    python3-resolvelib-native \
"

PYPI_PACKAGE = "ansible-core"

SRC_URI[md5sum] = "71b0b1e781a9378c6aa00b4f4102fe1b"
SRC_URI[sha256sum] = "a4508707262be11bb4dd98a006f1b14817879a055e6b6c46ad9fca8894fb3073"

inherit pypi
inherit setuptools3
inherit native
