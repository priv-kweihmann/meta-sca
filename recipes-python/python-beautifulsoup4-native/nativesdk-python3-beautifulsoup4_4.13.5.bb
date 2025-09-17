SUMMARY = "library that makes it easy to scrape information from web pages"
HOMEPAGE = "http://www.crummy.com/software/BeautifulSoup/bs4/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96e0034f7c9443910c486773aa1ed9ac"

DEPENDS += "nativesdk-python3-soupsieve"

PYPI_PACKAGE = "beautifulsoup4"

SRC_URI[md5sum] = "d68e27abe7d5eec1624346223f5e0751"
SRC_URI[sha256sum] = "5e70131382930e7c3de33450a2f54a63d5e4b19386eab43a5b34d594268f3695"

inherit pypi
inherit python_hatchling
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-soupsieve"
