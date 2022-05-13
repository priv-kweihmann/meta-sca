SRC_URI += "https://proxy.golang.org/github.com/cloudfoundry/jibber_jabber/@v/v0.0.0-20151120183258-bcc4c8345a21.zip;srcoutput=github.com/cloudfoundry/jibber_jabber;srcinput=github.com/cloudfoundry/jibber_jabber@v0.0.0-20151120183258-bcc4c8345a21;downloadfilename=github-com-cloudfoundry-jibber-jabber-0.0.0-20151120183258-bcc4c8345a21.zip;name=github-com-cloudfoundry-jibber-jabber"
SRC_URI[github-com-cloudfoundry-jibber-jabber.sha256sum] = "ccdd12db6e21484997c713ec6a62ce3b12d4ff5df59fd0a3ad94d32836ca883a"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cloudfoundry/jibber_jabber/LICENSE;md5=cbb45add8fd7cba6cdf4dcdad47bacc9 \
"

GOSRC_INCLUDEGUARD += "github.com-cloudfoundry-jibber-jabber-sources.inc"

