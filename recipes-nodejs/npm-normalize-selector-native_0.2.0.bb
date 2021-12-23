SUMMARY = "NPM: normalize-selector"
DESCRIPTION = "Normalize CSS Selectors"
HOMEPAGE = "http://github.com/getify/normalize-selector"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=32;md5=3a4f8994bcdf41287ba4a107872f9bb5"

SRC_URI = "https://registry.npmjs.org/normalize-selector/-/normalize-selector-0.2.0.tgz"
SRC_URI[md5sum] = "04910ada6a7cb9aef5589d2a1fdb4cba"
SRC_URI[sha256sum] = "5e3206033e66168919c2023c99b1a643497b1dc05312309fe839e6053b654978"

NPM_PKGNAME = "normalize-selector"

inherit npmhelper
inherit native
