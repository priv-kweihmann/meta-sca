SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-4.5.0.tgz"
SRC_URI[md5sum] = "6e78d7c54181feafd1904367e1b14ddc"
SRC_URI[sha256sum] = "9733b968223c41cfa51199e8c079eb0e66da841b392824d3d21744c29081a0f2"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
