SUMMARY = "NPM: prepend-http"
DESCRIPTION = "Prepend `http://` to humanized URLs like todomvc.com and localhost"
HOMEPAGE = "https://github.com/sindresorhus/prepend-http#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/prepend-http/-/prepend-http-1.0.4.tgz"
SRC_URI[md5sum] = "edd6b12fe9f6855e12c84121d9fb5539"
SRC_URI[sha256sum] = "18fe18f12cb7069ef6d29a0158887608412dbe1706636f3113d68158035ea9d3"

NPM_PKGNAME = "prepend-http"

inherit npmhelper
inherit native
