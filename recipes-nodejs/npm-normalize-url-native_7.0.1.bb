SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-7.0.1.tgz"
SRC_URI[md5sum] = "a1f819296da4a1b83d8371bbe2cb1f67"
SRC_URI[sha256sum] = "ab8760106192baf6f103dc95164e3b4bcaef40d7270387450460d5575d6b08ec"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
