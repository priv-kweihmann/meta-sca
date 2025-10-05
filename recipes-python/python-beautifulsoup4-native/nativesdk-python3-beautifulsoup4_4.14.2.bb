SUMMARY = "library that makes it easy to scrape information from web pages"
HOMEPAGE = "http://www.crummy.com/software/BeautifulSoup/bs4/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96e0034f7c9443910c486773aa1ed9ac"

DEPENDS += "nativesdk-python3-soupsieve"

PYPI_PACKAGE = "beautifulsoup4"

SRC_URI[md5sum] = "455746626d9f6ae164fc8a62af7e1906"
SRC_URI[sha256sum] = "2a98ab9f944a11acee9cc848508ec28d9228abfd522ef0fad6a02a72e0ded69e"

inherit pypi
inherit python_hatchling
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-soupsieve"
