SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables"
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

PYPI_PACKAGE = "ConfigArgParse"

SRC_URI[md5sum] = "d71f06d965d784a802c866ac035bf7a4"
SRC_URI[sha256sum] = "f30736dcd4e00455ffe3087454799ccb7f9b61d765492dd4b35bbcd62379db12"

inherit pypi
inherit setuptools3
inherit native
