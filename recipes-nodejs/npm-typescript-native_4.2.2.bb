SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.2.2.tgz"
SRC_URI[md5sum] = "3b7998b09ea4d5d7aefc4f35a19040aa"
SRC_URI[sha256sum] = "2bddffdbc744f75f6b57e0f7225bc5a945b228b627b8194a993d0993e2e0767f"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
