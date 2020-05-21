SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-3.9.3.tgz"
SRC_URI[md5sum] = "97c963bd0090a0c908580fc8754b9dbb"
SRC_URI[sha256sum] = "5283860b4f5fe40dd9d508fc1759db4b61a19ce96c7be6cc66044c5b74469677"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
