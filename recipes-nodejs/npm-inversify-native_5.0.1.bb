SUMMARY = "NPM: inversify"
DESCRIPTION = "A powerful and lightweight inversion of control container for JavaScript and Node.js apps powered by TypeScript."
HOMEPAGE = "http://inversify.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=305aec93062e1c124bb52446f4f2eaa1"

SRC_URI = "https://registry.npmjs.org/inversify/-/inversify-5.0.1.tgz"
SRC_URI[md5sum] = "f734c28dc231c95177552fb7fb013c86"
SRC_URI[sha256sum] = "21ba7117b6c6eb3ccb77da06edc0ec096bb29d5e75f460d4a37991024e4c1115"

NPM_PKGNAME = "inversify"

inherit npmhelper
inherit native
