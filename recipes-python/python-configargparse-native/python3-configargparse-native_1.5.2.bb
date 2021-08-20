SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables"
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

PYPI_PACKAGE = "ConfigArgParse"

SRC_URI[md5sum] = "201459957caabe5246d18fa8b1bf59ab"
SRC_URI[sha256sum] = "c39540eb4843883d526beeed912dc80c92481b0c13c9787c91e614a624de3666"

inherit pypi
inherit setuptools3
inherit native
