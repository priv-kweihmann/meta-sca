SUMMARY = "RubyGem: aws-sdk-codepipeline"
DESCRIPTION = "Official AWS Ruby gem for AWS CodePipeline (CodePipeline)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "2dc83016e3965e1cfa5bafa9de345fcd"
SRC_URI[sha256sum] = "e50913b87e021661e23741a587b57bd1ade54500b796fea7dec360c885adaacc"

GEM_NAME = "aws-sdk-codepipeline"

inherit rubygems
