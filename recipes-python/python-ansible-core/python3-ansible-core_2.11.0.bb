SUMMARY = "Ansible is the simplest way to automate apps and IT infrastructure"
DESCRIPTION = "Ansible is a simple IT automation platform that makes your applications and systems easier to deploy"
HOMEPAGE = "https://github.com/ansible/ansible/"
SECTION = "devel/python"

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS_class-native += "\
    python3-cryptography-native \
    python3-jinja2-native \
    python3-packaging-native \
    python3-pyyaml-native \
    python3-resolvelib-native \
"

PYPI_PACKAGE = "ansible-core"

SRC_URI[md5sum] = "909ae2606e7c217d849fc6883619f9a4"
SRC_URI[sha256sum] = "9470ceb710711eacd75f1bcae802af036ab2a6c2cd5a13bfcb50b2d89667c9c5"

inherit pypi
inherit setuptools3

RDEPENDS_${PN}_class-target += "\
    bash \
    python3-cryptography \
    python3-jinja2 \
    python3-modules \
    python3-packaging \
    python3-pyyaml \
    python3-resolvelib \
"

BBCLASSEXTEND = "native"
