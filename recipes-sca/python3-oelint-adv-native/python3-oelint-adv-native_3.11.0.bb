SUMMARY = "Advanced oelint"
DESCRIPTION = "Based on the OpenEmbedded Styleguide and work done by oe-stylize-tool\n \
               this module offers a (nearly) complete linter for bitbake-recipes."
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-adv"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

DEPENDS += "\
            python3-anytree-native \
            python3-colorama-native \
            python3-oelint-parser-native \
            python3-urllib3-native \
            "

SRC_URI = "git://github.com/priv-kweihmann/oelint-adv.git;protocol=https;branch=master"
SRCREV = "f0a70c2e6bd2fd5e26e86e3abd5bbf884f4ca161"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "oelint"
