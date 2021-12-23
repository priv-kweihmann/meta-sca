SUMMARY = "A library to manipulate gettext files (po and mo files)"
HOMEPAGE = "https://bitbucket.org/izi/polib/wiki/Home"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca9b0a3e473327024be9af47bc41fb14"

PYPI_PACKAGE = "polib"

SRC_URI[md5sum] = "d6528d4711cb3eb4c7c5a61f2f3564a7"
SRC_URI[sha256sum] = "e02c355ae5e054912e3b0d16febc56510eff7e49d60bf22aecb463bd2f2a2dfa"

inherit pypi
inherit setuptools3
inherit native
