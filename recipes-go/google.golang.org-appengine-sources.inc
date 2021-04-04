SRC_URI += "https://proxy.golang.org/google.golang.org/appengine/@v/v1.6.7.zip;srcoutput=google.golang.org/appengine;srcinput=google.golang.org/appengine@v1.6.7;downloadfilename=google-golang-org-appengine-1.6.7.zip;name=google-golang-org-appengine"
SRC_URI[google-golang-org-appengine.sha256sum] = "79f80dfac18681788f1414e21a4a7734eff4cdf992070be9163103eb8d9f92cd"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/google.golang.org/appengine/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "google.golang.org-appengine-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
