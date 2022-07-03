/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package skeleton;

import ghidra.app.services.AbstractAnalyzer;
import ghidra.app.services.AnalyzerType;
import ghidra.app.util.importer.MessageLog;
import ghidra.framework.options.Options;
import ghidra.program.model.address.AddressSetView;
import ghidra.program.model.listing.Program;
import ghidra.util.exception.CancelledException;
import ghidra.util.task.TaskMonitor;

/** TODO: Provide class-level documentation that describes what this analyzer
  * does.
  */
class SkeletonAnalyzer
    extends AbstractAnalyzer(
      "My Analyzer",
      "Analyzer description goes here",
      AnalyzerType.BYTE_ANALYZER
    ) {

  override def getDefaultEnablement(program: Program): Boolean = {

    // TODO: Return true if analyzer should be enabled by default

    false
  }

  override def canAnalyze(program: Program): Boolean = {

    // TODO: Examine 'program' to determine of this analyzer should analyze it.  Return true
    // if it can.

    false
  }

  override def registerOptions(options: Options, program: Program): Unit = {

    // TODO: If this analyzer has custom options, register them here

    options.registerOption(
      "Option name goes here",
      false,
      null,
      "Option description goes here"
    );
  }

  @throws(classOf[CancelledException])
  override def added(
      program: Program,
      set: AddressSetView,
      monitor: TaskMonitor,
      log: MessageLog
  ): Boolean = {

    // TODO: Perform analysis when things get added to the 'program'.  Return true if the
    // analysis succeeded.

    false
  }
}
