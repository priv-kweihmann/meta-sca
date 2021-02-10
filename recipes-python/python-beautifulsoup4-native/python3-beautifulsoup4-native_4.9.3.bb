SUMMARY = "library that makes it easy to scrape information from web pages"
HOMEPAGE = "http://www.crummy.com/software/BeautifulSoup/bs4/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d50c7af08b5e78653a504bfbfb80bf22"

DEPENDS += "python3-soupsieve-native"

PYPI_PACKAGE = "beautifulsoup4"

SRC_URI[md5sum] = "57fd468ae3eb055f6871106e8f7813e2"
SRC_URI[sha256sum] = "84729e322ad1d5b4d25f805bfa05b902dd96450f43842c4e99067d5e1369eb25"

inherit pypi
inherit setuptools3
inherit native
