SUMMARY = "Ansible is the simplest way to automate apps and IT infrastructure"
DESCRIPTION = "Ansible is a simple IT automation platform that makes your applications and systems easier to deploy"
HOMEPAGE = "https://github.com/ansible/ansible/"
SECTION = "devel/python"

DEFAULT_PREFERENCE = "-1"
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

SRC_URI[md5sum] = "a54c5c5f9b35ea77ccc7f2ae67a8e612"
SRC_URI[sha256sum] = "0e9049a1ab8b8c54ddc80738dc0ab2b57870be6fe4cd4e5585d471547ab74b13"

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
