SUMMARY = "NPM: mkdirp"
DESCRIPTION = "Recursively mkdir, like `mkdir -p`"
HOMEPAGE = "https://github.com/isaacs/node-mkdirp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f653359cc2be3ff55aa601d58d84c808"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mkdirp/-/mkdirp-1.0.4.tgz"
SRC_URI[md5sum] = "f785d6b21c62a393216db8854f3320da"
SRC_URI[sha256sum] = "1d17074e41af6fe8f1c80df83f43aeaa5e1c2839451f2613caeaae4f0253d81a"

NPM_PKGNAME = "mkdirp"

inherit npmhelper
inherit native
