SRC_URI_append = " https://proxy.golang.org/go.uber.org/zap/@v/v1.16.0.zip;srcoutput=go.uber.org/zap;srcinput=go.uber.org/zap@v1.16.0;downloadfilename=go-uber-org-zap-1.16.0.zip;name=go-uber-org-zap"
SRC_URI[go-uber-org-zap.sha256sum] = "611e9bd05f4391b2dbf3649ce91a82478ee990ff96249e545588f5d34a5a1d75"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/go.uber.org/zap/LICENSE.txt;md5=5e8153e456a82529ea845e0d511abb69 \
"
