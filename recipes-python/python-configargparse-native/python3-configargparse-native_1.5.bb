SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables"
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

PYPI_PACKAGE = "ConfigArgParse"

SRC_URI[md5sum] = "9178ba85c54ddd332cbbb638932bd645"
SRC_URI[sha256sum] = "dded3590373b7dae6ce6d0afeb4ae3def74761fdd78730952863914d4cb4bdb5"

inherit pypi
inherit setuptools3
inherit native
