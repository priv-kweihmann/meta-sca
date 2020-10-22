SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.0.16.tgz"
SRC_URI[md5sum] = "9543b25b636d38bfc690d057586f9f8b"
SRC_URI[sha256sum] = "53cf72bf82355655e1e8719f95681f9456fd5865e1817e18cd33b61d4ba29c7f"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
