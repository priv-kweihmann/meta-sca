SUMMARY = "NPM: array-iterate"
DESCRIPTION = "forEach with the possibility to change the next position"
HOMEPAGE = "https://github.com/wooorm/array-iterate#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

SRC_URI = "https://registry.npmjs.org/array-iterate/-/array-iterate-1.1.4.tgz"
SRC_URI[md5sum] = "3b89125cf52f07e138299e927a26ce70"
SRC_URI[sha256sum] = "31b4c9a491d54080df0b4011cfce0fe249288ef0529f56840e5b09f21b5c3c2e"

NPM_PKGNAME = "array-iterate"

inherit npmhelper
inherit native
