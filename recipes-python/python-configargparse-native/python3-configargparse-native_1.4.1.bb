SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables"
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

PYPI_PACKAGE = "ConfigArgParse"

SRC_URI[md5sum] = "3a7860a96e5d5047ec89236729af2067"
SRC_URI[sha256sum] = "6df537158f28c5ef2e8a8146781833abbc6cb7fca81b1b55d18808ce3439235e"

inherit pypi
inherit setuptools3
inherit native
