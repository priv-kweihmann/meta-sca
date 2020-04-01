SUMMARY = "Ginkgo modules"
HOMEPAGE = "https://github.com/onsi/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
                    file://src/${GO_IMPORT}/gomega/LICENSE;md5=570603114d52313cb86c0206401c9af7 \
                    file://src/${GO_IMPORT}/ginkgo/LICENSE;md5=570603114d52313cb86c0206401c9af7 \
                   "

DEPENDS += "\
            github.com-fsnotify-fsnotify-native \
            github.com-go-tomb-tomb-native \
            github.com-go-yaml-yaml-native \
            github.com-golang-protobuf-native \
            github.com-hpcloud-tail-native \
            golang.org-x-net-native \
            golang.org-x-sync-native \
            golang.org-x-sys-native \
            golang.org-x-text-native \
            gopkg.in-yaml.v2-native \
           "

PROVIDES += "github.com-onsi-gomega-native"
PROVIDES += "github.com-onsi-ginkgo-native"

SRC_URI = "\
           git://github.com/onsi/gomega.git;protocol=https;name=gomega;destsuffix=git/src/github.com/onsi/gomega \
           git://github.com/onsi/ginkgo.git;protocol=https;name=ginkgo;destsuffix=git/src/github.com/onsi/ginkgo \
          "
## v1.5.0
SRCREV_gomega = "90e289841c1ed79b7a598a7cd9959750cb5e89e2"
## v1.8.0
SRCREV_ginkgo = "eea6ad008b96acdaa524f5b409513bf062b500ad"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/onsi"

inherit go
inherit native
