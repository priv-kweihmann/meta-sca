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
            python3-oelint-data-native \
            python3-oelint-parser-native \
            python3-urllib3-native \
            "

SRC_URI[sha256sum] = "169c446c48d01c28bae21832d4013cacb9e867ed7b8b651a93a4fb995fa68edd"

PYPI_PACKAGE = "oelint-adv"

inherit sca-description
inherit python_setuptools_build_meta
inherit pypi
inherit pypi-old
inherit_defer native

SCA_TOOL_DESCRIPTION = "oelint"
