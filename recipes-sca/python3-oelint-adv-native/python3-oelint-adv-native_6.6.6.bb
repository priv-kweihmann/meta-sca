SUMMARY = "Advanced oelint"
DESCRIPTION = "Based on the OpenEmbedded Styleguide and work done by oe-stylize-tool\n \
               this module offers a (nearly) complete linter for bitbake-recipes."
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-adv"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

DEPENDS += "\
            python3-anytree-native \
            python3-argcomplete-native \
            python3-colorama-native \
            python3-oelint-parser-native \
            python3-urllib3-native \
            "

SRC_URI[sha256sum] = "a0de566ea59a159efe220b01d1be7ca629dff6a0d249fc38a7eddaa4335bdfd6"

PYPI_PACKAGE = "oelint-adv"

inherit sca-description
inherit setuptools3
inherit pypi
inherit pypi-old
inherit_defer native

SCA_TOOL_DESCRIPTION = "oelint"
