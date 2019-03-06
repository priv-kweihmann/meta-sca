SUMMARY = "Tool for checking elf-symbols against rules"
DESCRIPTION = "Based on the OpenEmbedded Styleguide and work done by oe-stylize-tool\n \
               this module offers a (nearly) complete linter for bitbake-recipes."
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-adv"

SRC_URI = "git://github.com/priv-kweihmann/oelint-adv.git;protocol=http;branch=master;tag=${PV}"

PV = "1.0.0"

S = "${WORKDIR}/git"
B = "${S}"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

inherit native
inherit setuptools3

RDEPENDS_${PN} += "python3-core-native"
