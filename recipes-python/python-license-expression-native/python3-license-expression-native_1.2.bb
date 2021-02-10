SUMMARY = "Utility library to parse, normalize and compare License expressions"
HOMEPAGE = "https://github.com/nexB/license-expression"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

DEPENDS += "python3-boolean.py-native"

PYPI_PACKAGE = "license-expression"

SRC_URI[md5sum] = "fd4cb295cc345be1071274cdbd81c969"
SRC_URI[sha256sum] = "7960e1dfdf20d127e75ead931476f2b5c7556df05b117a73880b22ade17d1abc"

inherit pypi
inherit setuptools3
inherit native
