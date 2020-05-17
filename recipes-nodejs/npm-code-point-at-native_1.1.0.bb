SUMMARY = "NPM: code-point-at"
DESCRIPTION = "ES2015 `String#codePointAt()` ponyfill"
HOMEPAGE = "https://github.com/sindresorhus/code-point-at#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/code-point-at/-/code-point-at-1.1.0.tgz"
SRC_URI[md5sum] = "c214d9956b6b675ad837e76eecfc2d4b"
SRC_URI[sha256sum] = "5279ca78986d6381852ac1b02592ae2dc5cc979317284b8aa1d7554107770b3d"

NPM_PKGNAME = "code-point-at"

inherit npmhelper
inherit native
