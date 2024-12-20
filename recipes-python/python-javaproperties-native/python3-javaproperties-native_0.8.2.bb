SUMMARY = "Read & write Java .properties files"
HOMEPAGE = "https://github.com/jwodder/javaproperties"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d75dc7ac5c771ffd55eb23e2095b8702"

SRC_URI[sha256sum] = "f780d17ca12d57da58519dcf9d821cbcdb6f98a8b5af661013e31a5050c59a0f"

PYPI_PACKAGE = "javaproperties"

inherit pypi
inherit python_hatchling
inherit_defer native
