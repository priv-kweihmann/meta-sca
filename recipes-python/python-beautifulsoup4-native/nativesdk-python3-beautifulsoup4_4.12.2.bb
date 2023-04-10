SUMMARY = "library that makes it easy to scrape information from web pages"
HOMEPAGE = "http://www.crummy.com/software/BeautifulSoup/bs4/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96e0034f7c9443910c486773aa1ed9ac"

DEPENDS += "nativesdk-python3-soupsieve"

PYPI_PACKAGE = "beautifulsoup4"

SRC_URI[md5sum] = "b49a6696a762e946c2be97c36a5adaa8"
SRC_URI[sha256sum] = "492bbc69dca35d12daac71c4db1bfff0c876c00ef4a2ffacce226d4638eb72da"

inherit pypi
inherit python_hatchling
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-soupsieve"
