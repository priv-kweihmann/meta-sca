SRC_URI_append = " https://proxy.golang.org/github.com/mozilla/scribe/@v/v0.0.0-20180711195314-fb71baf557c1.zip;srcoutput=github.com/mozilla/scribe;srcinput=github.com/mozilla/scribe@v0.0.0-20180711195314-fb71baf557c1;downloadfilename=github-com-mozilla-scribe-0.0.0-20180711195314-fb71baf557c1.zip;name=github-com-mozilla-scribe"
SRC_URI[github-com-mozilla-scribe.sha256sum] = "f92a2bcc665bf606d7f3abbf994917e2deedb8574a8d41eef11a6634f80d6f89"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mozilla/scribe/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
"
