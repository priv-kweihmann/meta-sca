SUMMARY = "library that makes it easy to scrape information from web pages"
HOMEPAGE = "http://www.crummy.com/software/BeautifulSoup/bs4/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d50c7af08b5e78653a504bfbfb80bf22"

DEPENDS += "python3-soupsieve-native"

PYPI_PACKAGE = "beautifulsoup4"

SRC_URI[md5sum] = "e754242642253dd31d249d00358d552e"
SRC_URI[sha256sum] = "c23ad23c521d818955a4151a67d81580319d4bf548d3d49f4223ae041ff98891"

inherit pypi
inherit setuptools3
inherit native
