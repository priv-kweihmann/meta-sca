SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-3.9.7.tgz"
SRC_URI[md5sum] = "ac55d79a823d7cc54f3288045616ad58"
SRC_URI[sha256sum] = "6ddba84372cd3078df4fd1fa2ea3ac11db5d498b384645308494bcd2935416c0"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
