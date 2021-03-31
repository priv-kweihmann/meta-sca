SRC_URI_append = " https://proxy.golang.org/go.mozilla.org/mozlog/@v/v0.0.0-20170222151521-4bb13139d403.zip;srcoutput=go.mozilla.org/mozlog;srcinput=go.mozilla.org/mozlog@v0.0.0-20170222151521-4bb13139d403;downloadfilename=go-mozilla-org-mozlog-0.0.0-20170222151521-4bb13139d403.zip;name=go-mozilla-org-mozlog"
SRC_URI[go-mozilla-org-mozlog.sha256sum] = "246dd9bbd31c427e46f14e012c03d3a0ab8e3d86dc1bd5d763f6a69f1a8d656b"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/go.mozilla.org/mozlog/LICENSE;md5=f27a50d2e878867827842f2c60e30bfc \
"
