SUMMARY = "Ansible is the simplest way to automate apps and IT infrastructure"
DESCRIPTION = "Ansible is a simple IT automation platform that makes your applications and systems easier to deploy"
HOMEPAGE = "https://github.com/ansible/ansible/"
SECTION = "devel/python"

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS:class-native += "\
    python3-cryptography-native \
    python3-jinja2-native \
    python3-packaging-native \
    python3-pyyaml-native \
    python3-resolvelib-native \
"

PYPI_PACKAGE = "ansible-core"

SRC_URI[md5sum] = "1ecabe87d1f07e6745dbc919df0c6fc5"
SRC_URI[sha256sum] = "0ced1b4f67197edb27b50934c95d4cb644c6d635d72c7f826c4425dfe4537674"

inherit pypi
inherit setuptools3

RDEPENDS:${PN}:class-target += "\
    bash \
    python3-cryptography \
    python3-jinja2 \
    python3-modules \
    python3-packaging \
    python3-pyyaml \
    python3-resolvelib \
"

BBCLASSEXTEND = "native"
