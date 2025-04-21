SUMMARY = "library that makes it easy to scrape information from web pages"
HOMEPAGE = "http://www.crummy.com/software/BeautifulSoup/bs4/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96e0034f7c9443910c486773aa1ed9ac"

DEPENDS += "python3-soupsieve-native"

PYPI_PACKAGE = "beautifulsoup4"

SRC_URI[md5sum] = "1c03bc381aff2ba72178fc775d39e991"
SRC_URI[sha256sum] = "dbb3c4e1ceae6aefebdaf2423247260cd062430a410e38c66f2baa50a8437195"

inherit pypi
inherit python_hatchling
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-soupsieve"
