SUMMARY = "library that makes it easy to scrape information from web pages"
HOMEPAGE = "http://www.crummy.com/software/BeautifulSoup/bs4/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96e0034f7c9443910c486773aa1ed9ac"

DEPENDS += "python3-soupsieve-native"

PYPI_PACKAGE = "beautifulsoup4"

SRC_URI[md5sum] = "4ecf1fb561e84adfb3146650e3d51394"
SRC_URI[sha256sum] = "74e3d1928edc070d21748185c46e3fb33490f22f52a3addee9aee0f4f7781051"

inherit pypi
inherit python_hatchling
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-soupsieve"
