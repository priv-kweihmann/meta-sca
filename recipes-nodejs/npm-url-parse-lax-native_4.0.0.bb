SUMMARY = "NPM: url-parse-lax"
DESCRIPTION = "Lax url.parse() with support for protocol-less URLs & IPs"
HOMEPAGE = "https://github.com/sindresorhus/url-parse-lax#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-prepend-http-native"

SRC_URI = "https://registry.npmjs.org/url-parse-lax/-/url-parse-lax-4.0.0.tgz"
SRC_URI[md5sum] = "f5934c61cd1752105c8b018ab7d9abf5"
SRC_URI[sha256sum] = "5c8fa98772886e87a1c86830c8e922fb75f512be6c8701af02bd1165d2689f4c"

NPM_PKGNAME = "url-parse-lax"

inherit npmhelper
inherit native
