SRC_URI += "https://proxy.golang.org/gopkg.in/alexcesaro/quotedprintable.v3/@v/v3.0.0-20150716171945-2caba252f4dc.zip;srcoutput=gopkg.in/alexcesaro/quotedprintable.v3;srcinput=gopkg.in/alexcesaro/quotedprintable.v3@v3.0.0-20150716171945-2caba252f4dc;downloadfilename=gopkg-in-alexcesaro-quotedprintable-v3-3.0.0-20150716171945-2caba252f4dc.zip;name=gopkg-in-alexcesaro-quotedprintable-v3"
SRC_URI[gopkg-in-alexcesaro-quotedprintable-v3.sha256sum] = "1a310c5e55038937be3e69765276449601ca582f681129f7d9d47e052846cafc"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/alexcesaro/quotedprintable.v3/LICENSE;md5=9e6777947389c7917571bdf8d11872bd \
"

GOSRC_INCLUDEGUARD += "gopkg.in-alexcesaro-quotedprintable.v3-sources.inc"

